# 365 Daily Java Programming Tasks

A roadmap of bite-sized daily tasks to learn Java step by step.  
Each task is small enough to complete in a day but builds up toward real projects.

---

## Beginner → Intermediate Tasks (1–365)

**1. Install Java JDK and set JAVA_HOME.**  
**2. Install an IDE (IntelliJ/VS Code/Eclipse) and create your first Java project.**
**3. Write HelloWorld that prints “Hello, Java!”.**  
**4. Declare variables of types int, double, boolean, char, String. Print them.**  
**5. Read a line from the console using Scanner.**  
**6. Practice arithmetic: input two ints and print sum/difference/product/quotient.**  
**7. Write code to convert Celsius to Fahrenheit.**  
**8. Use if / else to check if a number is even or odd.**  
**9. Use switch to map numbers 1–7 to weekday names.**  
**10. Use a for loop to print first 20 natural numbers.**  
**11. Use a while loop to compute factorial of a number.**  
**12. Use do-while to repeatedly prompt until user types “quit”.**  
**13. Create and call a method that returns the square of a number.**  
**14. Overload a method with different parameter types.**  
**15. Write a method that accepts varargs and sums them.**  
**16. Create a Person class with name and age fields.**  
**17. Add constructors, getters and setters to Person.**  
**18. Override toString() in Person.** 
**19. Create a Student subclass that extends Person.**  
**20. Demonstrate polymorphism: store Student in a Person variable.**  
**21. Create an interface Printable with print() and implement it.**  
**22. Use abstract class: make Animal abstract with speak() abstract method.**  
**23. Use final keyword on a class and on a method; explain effect.**  
**24. Use static fields and methods; create a counter for objects.**  
**25. Practice equals() and hashCode() for a simple class.**  
**26. Create and use an ArrayList of strings.**  
**27. Iterate an ArrayList with for, for-each, and Iterator.**  
**28. Use a LinkedList and compare insert/remove speed conceptually.**  
**29. Use a HashSet to eliminate duplicates from an array.**  
**30. Use a TreeSet to store sorted unique values.**  
**31. Use a HashMap to count word frequency from a small sentence.**  
**32. Iterate HashMap entries and print key/value pairs.**  
**33. Use Map.computeIfAbsent for cleaner counting.**  
**34. Practice Collections.sort() on a list of integers.**  
**35. Use Comparator to sort objects by a field.**  
**36. Read and write a text file using Files.readAllLines / Files.write.**  
**37. Use BufferedReader and BufferedWriter for file I/O.**  
**38. Serialize a simple object using ObjectOutputStream and read it back.**  
**39. Parse integers safely with try/catch for NumberFormatException.**  
**40. Learn checked vs unchecked exceptions; create a custom checked exception.**  
**41. Use try-with-resources to auto-close I/O streams.**  
**42. Use StringBuilder to build a long string efficiently.**  
**43. Split and join strings; count words in a sentence.**  
**44. Practice regex: validate an email address (simple pattern).**  
**45. Use Pattern and Matcher to find all numbers in a string.**  
**46. Work with dates: print current date/time using java.time.LocalDateTime.**  
**47. Format dates with DateTimeFormatter.**  
**48. Parse a date string into a LocalDate**.  
**49. Create a basic timer using Thread.sleep and System.currentTimeMillis**.  
**50. Use Runnable to start a new thread that prints numbers.**  
**51. Use Callable and Future with an ExecutorService.**  
**52. Use synchronized to protect a shared counter (multi-thread basics).** 
**53. Learn about race conditions; create two threads that increment without sync.**  
**54. Use ConcurrentHashMap or AtomicInteger for thread-safe operations.**  
**55. Build a simple producer-consumer with BlockingQueue.**  
**56. Use Stream API to filter, map, reduce a list of numbers.**  
**57. Convert a list of objects to a map using streams.**  
**58. Use Optional<T> to avoid null checks in a small example.**  
**59. Learn method references and lambda expressions with Comparator.**  
**60. Chain stream operations: filter, sort, limit, collect.**  
**61. Read JSON from a string using a library (Jackson/Gson).**  
**62. Write an object to JSON string and back with Jackson/Gson.**  
**63. Use Properties to load config from .properties file.**  
**64. Use BigInteger and BigDecimal for large integer/precise decimal math.**  
**65. Implement binary search on a sorted array.**  
**66. Implement bubble sort; then implement a better sort (e.g., quicksort).**  
**67. Solve FizzBuzz cleanly using modular arithmetic.**  
**68. Write a recursive function (e.g., compute Fibonacci) and an iterative version.**  
**69. Detect palindrome strings (ignore non-letters and case).**  
**70. Reverse a string using a stack or using StringBuilder.reverse().**  
**71. Implement a stack using ArrayDeque.**  
**72. Implement a queue using LinkedList or ArrayDeque.**  
**73. Build a simple linked list node class and traverse it.**  
74. Implement depth-first search on a simple graph represented by adjacency lists.  
75. Write code to check balanced parentheses using a stack.  
76. Implement a simple LRU cache using LinkedHashMap.  
77. Learn about generics: create a generic Pair<A,B> class.  
78. Use bounded generics (<? extends Number>) in a method.  
79. Write a small unit test using JUnit for one class method.  
80. Use assertions with assert to check invariants in development.  
81. Use Maven or Gradle to create and build a simple project.  
82. Add a dependency (e.g., JUnit or Gson) with Maven/Gradle and use it.  
83. Explore Java modules (simple module-info.java).  
84. Create a small command-line app that accepts arguments and prints them.  
85. Build a CLI menu loop: add/view/delete simple text notes.  
86. Create a TODO list persisted to a text file.  
87. Create a small address book using HashMap saved to JSON.  
88. Implement input validation for phone numbers in the address book.  
89. Use Files.walk to list files in a directory recursively.  
90. Read a CSV file and parse into objects.  
91. Write program to count lines/words/characters in a file (wc clone).  
92. Implement a password strength checker (length, digits, symbols).  
93. Hash a password using SHA-256 (use MessageDigest).  
94. Store hashed password in a file and validate login against it.  
95. Base64-encode and decode a string.  
96. Encrypt/decrypt a string using AES.  
97. Learn sockets: create a simple TCP client that connects to an echo server.  
98. Create a simple TCP server that echoes messages to the client.  
99. Learn HTTP basics: make an HTTP GET request using HttpURLConnection or HttpClient.  
100. Parse JSON response from a public API (offline mock if no internet).  
101. Build a tiny REST client that GETs and prints a JSON field.  
102. Use java.nio.file.Path and Files for modern file APIs.  
103. Implement simple logging using java.util.logging or SLF4J.  
104. Use ResourceBundle to support internationalized messages.  
105. Practice exception handling: cleanup and rethrow exceptions properly.  
106. Create an encryption key and securely store it (conceptual).  
107. Implement command pattern for menu commands.  
108. Build a simple calculator using OOP (operations as objects).  
109. Create a basic Swing GUI that shows “Hello GUI”.  
110. Add a button to the Swing GUI that increments a counter.  
111. Create a small JavaFX project (label + text field).  
112. Build a simple form that validates user input (name, email).  
113. Save form submissions to a CSV file.  
114. Create a progress bar in GUI for a long-running task.  
115. Learn about event dispatch thread and SwingUtilities.invokeLater.  
116. Parse XML using DocumentBuilder and print elements.  
117. Use JAXB or DOM to map XML to objects.
119. Create a properties editor GUI for .properties config.  
120. Create an image viewer that loads and displays an image.  
121. Resize an image (basic scaling) and save the result.  
121. Add keyboard shortcuts to your Swing/JavaFX app.  
122. Build a stopwatch GUI app with start/stop/reset.  
123. Implement a simple notepad (open/save text files).  
124. Add a search function to the notepad.  
125. Create a drawing app with mouse events (draw lines/shapes).  
126. Add color picker and thickness option to drawing app.  
127. Build a simple calculator GUI (buttons for digits + operators).  
128. Add keyboard input support to calculator GUI.  
129. Create a Tic-Tac-Toe game in console.  
130. Upgrade Tic-Tac-Toe to GUI with Swing/JavaFX.  
131. Add AI opponent (random moves) for Tic-Tac-Toe.  
132. Improve AI with minimax algorithm for Tic-Tac-Toe.  
133. Create a Hangman console game.  
134. Upgrade Hangman to GUI version.  
135. Create a number guessing game (random number 1–100).  
136. Add difficulty levels (easy, medium, hard).  
137. Build a rock-paper-scissors game with computer opponent.  
138. Add score tracking to rock-paper-scissors.  
139. Create a simple quiz app (questions + multiple choice).  
140. Load quiz questions from a file (JSON/CSV).  
141. Add a timer to quiz questions.  
142. Store quiz scores in a file or database.  
143. Build a to-do list GUI app with add/delete tasks.  
144. Add “mark as completed” option to to-do list app.  
145. Save/load tasks from a file.  
146. Add search/filter to to-do list app.  
147. Create a budget tracker app.  
148. Add income/expense categories.  
149. Generate monthly summary report in budget tracker.  
150. Export budget data to CSV.  
151. Create a personal diary/journal app.  
152. Encrypt diary entries before saving.  
153. Add password protection to diary app.  
154. Build a contact manager with phone/email.  
155. Add search and sort by name in contact manager.  
156. Save/load contacts to JSON.  
157. Build a simple chat app (client + server using sockets).  
158. Add multiple clients support to chat server.  
159. Add usernames to chat app.  
160. Add private messages in chat app.  
161. Build a file sharing server/client app.  
162. Add progress bar for file transfers.  
163. Create a weather app (mock API if no internet).  
164. Display forecast in GUI table.  
165. Create a unit converter (length, weight, temperature).  
166. Add currency converter (mock exchange rates).  
167. Build a dictionary app (word + meaning).  
168. Add search suggestions to dictionary app.  
169. Save user’s favorite words.  
170. Create a flashcard study app.  
171. Add spaced repetition (review schedule).  
172. Save flashcards to a file.  
173. Build a timer/reminder app.  
174. Add alarm sound for reminders.  
175. Create a Pomodoro timer app.  
176. Log completed pomodoro sessions.  
177. Create a habit tracker app.  
178. Generate weekly progress report.  
179. Create a BMI calculator.  
180. Add health tips based on BMI result.  
181. Build a simple expense splitter (split bills among friends).  
182. Add debts/settlement tracker.  
183. Build a password manager app.  
184. Encrypt saved passwords.  
185. Add master password login.  
186. Create a notes app with categories.  
187. Add search and tags to notes app.  
188. Save notes in database or file.  
189. Build a recipe manager app.  
190. Add ingredient search.  
191. Add option to scale recipe servings.  
192. Build a student grade tracker app.  
193. Calculate GPA automatically.  
194. Export grades to CSV.  
195. Build a simple library management app.  
196. Add borrow/return functions.  
197. Track overdue books.  
198. Build a music playlist manager.  
199. Add play/pause/stop buttons (mock, no real audio).  
200. Save playlists to JSON.  
201. Build a movie collection manager.  
202. Add ratings and genres.  
203. Search by genre in movie manager.  
204. Build a car rental system (basic CRUD).  
205. Track rental dates and return status.  
206. Add cost calculator for rentals.  
207. Build a hotel booking system.  
208. Add room availability calendar.  
209. Track guest information.  
210. Build a flight booking system (mock).  
211. Add seat selection feature.  
212. Print booking confirmation.  
213. Build an online shopping cart (console version).  
214. Add product catalog with prices.  
215. Calculate total with discounts.  
216. Add checkout with invoice.  
217. Build an employee payroll system.  
218. Calculate salaries and deductions.  
219. Generate monthly pay slips.  
220. Save employee data to a file.  
221. Build a banking system (console).  
222. Add deposit/withdraw functions.  
223. Track account balances.  
224. Add transfer between accounts.  
225. Save transactions in file.  
226. Build a stock portfolio tracker.  
227. Track gains/losses (mock prices).  
228. Export portfolio to CSV.  
229. Build a job application tracker.  
230. Add status (applied/interviewed/hired).  
231. Export job applications to CSV.  
232. Build a resume generator app.  
233. Fill in template with user data.  
234. Export resume to text/HTML.  
235. Build an event scheduler.  
236. Add calendar view.  
237. Set recurring events.  
238. Send reminder notifications.  
239. Build a sports score tracker.  
240. Add team ranking table.
241. Build a fitness tracker app.  
242. Log workouts and calories burned.  
243. Generate weekly fitness report.  
244. Build a step counter simulator (mock data).  
245. Build a travel itinerary planner.  
246. Add destinations with dates.  
247. Export itinerary to text file.  
248. Build a ticket booking system (console).  
249. Add seating chart display.  
250. Generate e-tickets as text output.  
251. Build a hospital patient management system.  
252. Track patients, doctors, and appointments.  
253. Add billing system to hospital app.  
254. Build a school timetable generator.  
255. Add teacher-subject mapping.  
256. Generate weekly timetable.  
257. Build an exam scheduler.  
258. Avoid conflicts in exam schedule.  
259. Export schedule to CSV.  
260. Build a campus navigation app (mock).  
261. Represent campus as graph nodes.  
262. Find shortest path between buildings.  
263. Build a transportation booking system.  
264. Add bus/train schedules.  
265. Generate tickets.  
266. Build a parking lot management system.  
267. Track available/occupied spaces.  
268. Add parking fee calculator.  
269. Build a restaurant ordering system.  
270. Add menu items and prices.  
271. Generate customer bills.  
272. Add daily sales summary.  
273. Build a food delivery system (mock).  
274. Assign delivery driver.  
275. Track delivery status.  
276. Build a queue simulation app.  
277. Simulate customers in line.  
278. Display average waiting time.  
279. Build a bank ATM simulator.  
280. Add PIN authentication.  
281. Add withdraw/deposit functions.  
282. Print transaction receipt.  
283. Build a vending machine simulator.  
284. Accept coins (mock input).  
285. Dispense selected product.  
286. Return change.  
287. Build an elevator simulator.  
288. Simulate floors and movement.  
289. Handle multiple requests.  
290. Build a traffic light simulator.  
291. Cycle through red/yellow/green lights.  
292. Add pedestrian crossing button.  
293. Build a car racing game (console).  
294. Add random speeds for cars.  
295. Display winner at finish line.  
296. Build a maze game.  
297. Use DFS/BFS to solve maze.  
298. Add player movement in maze.  
299. Build a chessboard GUI (no logic).  
300. Add piece movement rules.  
301. Detect valid moves in chess.  
302. Detect checkmate condition.  
303. Build a Sudoku solver (backtracking).  
304. Add Sudoku puzzle generator.  
305. Create a crossword puzzle solver.  
306. Add dictionary-based word fill.  
307. Build a minesweeper game.  
308. Add GUI grid with mines.  
309. Add win/lose condition.  
310. Build a memory card matching game.  
311. Shuffle cards and flip to match pairs.  
312. Track score and attempts.  
313. Build a snake game (console).  
314. Upgrade snake game to GUI.  
315. Add increasing difficulty levels.  
316. Build a Flappy Bird clone.  
317. Add obstacles and gravity physics.  
318. Track score in Flappy Bird.  
319. Build a platformer game (basic physics).  
320. Add jumping and collision detection.  
321. Add enemies to platformer.  
322. Build a shooting game (2D).  
323. Add bullets and targets.  
324. Track score and ammo.  
325. Build a space invaders clone.  
326. Add waves of enemies.  
327. Add power-ups.  
328. Build a pong game.  
329. Add AI opponent paddle.  
330. Track score and rounds.  
331. Build a brick breaker game.  
332. Add multiple levels.  
333. Add power-ups in brick breaker.  
334. Build a 2D RPG (basic).  
335. Add player stats and inventory.  
336. Add battle system (turn-based).  
337. Build a 2D farming game (basic).  
338. Add planting and harvesting crops.  
339. Add day-night cycle.  
340. Build a city builder simulator (basic).  
341. Add resource management.  
342. Add population growth.  
343. Build a tower defense game.  
344. Add waves of enemies.  
345. Add upgradeable towers.  
346. Build an online leaderboard system.  
347. Save high scores to database.  
348. Display leaderboard in GUI.  
349. Build a multiplayer game (basic sockets).  
350. Sync game state between 2 players.  
351. Add chat inside multiplayer game.  
352. Build a simple REST API server in Java (using Spark/Jetty).  
353. Add CRUD endpoints to REST API.  
354. Test REST API with Postman/cURL.  
355. Build a Spring Boot web app.  
356. Add REST endpoints with Spring Boot.  
357. Connect Spring Boot app to database.  
358. Build a user authentication system (login/register).  
359. Add JWT-based authentication.  
360. Build a blog website backend with Spring Boot.  
361. Add CRUD for blog posts.  
362. Add comments system.  
363. Secure blog API with authentication.  
364. Deploy Spring Boot app to cloud (Heroku/AWS).  
365. Plan the next 365 days: choose advanced paths (Spring, Microservices, Android, AI, etc.). 
