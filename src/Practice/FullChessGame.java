package Practice;
import javax.swing.*;
import java.awt.*;


public class FullChessGame {

    private static JButton[][] squares = new JButton[8][8];
    private static String selectedPiece = null;
    private static int selectedRow = -1, selectedCol = -1;
    private static String[][] board = new String[8][8];
    private static boolean whiteTurn = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Full Chess Game");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(8, 8));

        // Initialize board
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JButton btn = new JButton();
                btn.setOpaque(true);
                btn.setBorderPainted(false);
                btn.setFont(new Font("Arial", Font.BOLD, 36));
                btn.setFocusPainted(false);
                if ((row + col) % 2 == 0) btn.setBackground(Color.WHITE);
                else btn.setBackground(Color.GRAY);

                squares[row][col] = btn;
                panel.add(btn);

                final int r = row;
                final int c = col;
                btn.addActionListener(e -> handleClick(r, c));
            }
        }

        setupBoard();
        updateGUI();

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void setupBoard() {
        String[] backRowWhite = {"R","N","B","Q","K","B","N","R"};
        String[] backRowBlack = {"r","n","b","q","k","b","n","r"};

        // White pieces
        System.arraycopy(backRowWhite, 0, board[0], 0, 8);
        for(int i=0;i<8;i++) board[1][i] = "P";

        // Black pieces
        System.arraycopy(backRowBlack, 0, board[7], 0, 8);
        for(int i=0;i<8;i++) board[6][i] = "p";
    }

    private static void updateGUI() {
        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                squares[r][c].setText(board[r][c]==null?"":board[r][c]);
            }
        }
    }

    private static void handleClick(int row, int col) {
        String piece = board[row][col];

        // Select piece
        if(selectedPiece==null && piece!=null){
            boolean isWhitePiece = Character.isUpperCase(piece.charAt(0));
            if((whiteTurn && isWhitePiece) || (!whiteTurn && !isWhitePiece)){
                selectedPiece = piece;
                selectedRow = row;
                selectedCol = col;
                squares[row][col].setBackground(Color.YELLOW);
            }
        }
        // Move piece
        else if(selectedPiece!=null){
            if(isValidMove(selectedPiece, selectedRow, selectedCol, row, col)){
                // Make move
                board[row][col] = selectedPiece;
                board[selectedRow][selectedCol] = null;

                // Switch turn
                whiteTurn = !whiteTurn;

                // Reset highlight
                resetColors();
                selectedPiece = null;
                selectedRow = -1;
                selectedCol = -1;

                updateGUI();

                // Check/checkmate
                if(isKingInCheck(board, true)) System.out.println("White King in check!");
                if(isKingInCheck(board, false)) System.out.println("Black King in check!");
                if(isCheckmate(board, true)) System.out.println("White King is checkmated!");
                if(isCheckmate(board, false)) System.out.println("Black King is checkmated!");
            }else{
                // invalid move → reset selection
                resetColors();
                selectedPiece = null;
                selectedRow = -1;
                selectedCol = -1;
            }
        }
    }

    private static void resetColors(){
        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                if((r+c)%2==0) squares[r][c].setBackground(Color.WHITE);
                else squares[r][c].setBackground(Color.GRAY);
            }
        }
    }

    // Valid moves for all pieces
    private static boolean isValidMove(String piece,int r1,int c1,int r2,int c2){
        if(r1==r2 && c1==c2) return false;

        String target = board[r2][c2];
        boolean targetIsWhite = target!=null && Character.isUpperCase(target.charAt(0));
        boolean pieceIsWhite = Character.isUpperCase(piece.charAt(0));
        if(target!=null && targetIsWhite==pieceIsWhite) return false; // can't capture own piece

        int dr = r2-r1;
        int dc = c2-c1;

        switch(piece.toUpperCase()){
            case "P":
                int dir = pieceIsWhite?1:-1;
                if(dc==0 && dr==dir && target==null) return true;
                if(dc==0 && dr==2*dir && ((pieceIsWhite && r1==1)||( !pieceIsWhite && r1==6)) && board[r1+dir][c1]==null && target==null) return true;
                if(Math.abs(dc)==1 && dr==dir && target!=null) return true;
                return false;
            case "R":
                if(r1==r2){
                    for(int c=Math.min(c1,c2)+1;c<Math.max(c1,c2);c++) if(board[r1][c]!=null) return false;
                    return true;
                }
                if(c1==c2){
                    for(int r=Math.min(r1,r2)+1;r<Math.max(r1,r2);r++) if(board[r][c1]!=null) return false;
                    return true;
                }
                return false;
            case "N":
                if(Math.abs(dr)==2 && Math.abs(dc)==1) return true;
                if(Math.abs(dr)==1 && Math.abs(dc)==2) return true;
                return false;
            case "B":
                if(Math.abs(dr)==Math.abs(dc)){
                    int rStep = dr>0?1:-1;
                    int cStep = dc>0?1:-1;
                    for(int i=1;i<Math.abs(dr);i++) if(board[r1+i*rStep][c1+i*cStep]!=null) return false;
                    return true;
                }
                return false;
            case "Q":
                return isValidMove(pieceIsWhite?"R":"r",r1,c1,r2,c2)||isValidMove(pieceIsWhite?"B":"b",r1,c1,r2,c2);
            case "K":
                return Math.abs(dr)<=1 && Math.abs(dc)<=1;
        }
        return false;
    }

    private static boolean isKingInCheck(String[][] board, boolean whiteKing){
        int kingRow=-1,kingCol=-1;
        String king = whiteKing?"K":"k";
        for(int r=0;r<8;r++)
            for(int c=0;c<8;c++)
                if(king.equals(board[r][c])) { kingRow=r; kingCol=c; break; }

        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                String p = board[r][c];
                if(p==null) continue;
                boolean isOpponent = whiteKing?Character.isLowerCase(p.charAt(0)):Character.isUpperCase(p.charAt(0));
                if(isOpponent){
                    if(isValidMove(p,r,c,kingRow,kingCol)) return true;
                }
            }
        }
        return false;
    }

    private static boolean isCheckmate(String[][] board, boolean whiteKing){
        if(!isKingInCheck(board,whiteKing)) return false;
        for(int r1=0;r1<8;r1++){
            for(int c1=0;c1<8;c1++){
                String p = board[r1][c1];
                if(p==null) continue;
                boolean myPiece = whiteKing?Character.isUpperCase(p.charAt(0)):Character.isLowerCase(p.charAt(0));
                if(!myPiece) continue;
                for(int r2=0;r2<8;r2++){
                    for(int c2=0;c2<8;c2++){
                        if(isValidMove(p,r1,c1,r2,c2)){
                            String temp = board[r2][c2];
                            board[r2][c2]=p; board[r1][c1]=null;
                            if(!isKingInCheck(board,whiteKing)){
                                board[r1][c1]=p; board[r2][c2]=temp;
                                return false;
                            }
                            board[r1][c1]=p; board[r2][c2]=temp;
                        }
                    }
                }
            }
        }
        return true;
    }
}




