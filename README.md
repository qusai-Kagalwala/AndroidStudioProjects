# 📱 AndroidStudioProjects

> **Mobile Application Development** — Kotlin & Android  
> Qusai Kagalwala | Roll No: 25KCSYCS17 | KC College, Mumbai | 2025–2026

---

## 🛠️ Tech Stack

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android_Studio-3DDC84?style=flat&logo=android-studio&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-003B57?style=flat&logo=sqlite&logoColor=white)
![Min SDK](https://img.shields.io/badge/Min_SDK-API_24-blue)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 📁 Project Index

| Folder | Practical | Topic |
|--------|-----------|-------|
| `HelloWorld` | P-1 & P-2 | Kotlin Basics |
| `MyApplication` | P-3 | Kotlin Logic Programs |
| `MyApplication2` | P-4 | Arrays & Collections |
| `MyApplication3` | P-5a/b | Android UI Basics |
| `MyApplication4` | P-5c/d | Activity Lifecycle |
| `MyApplication5` | P-6a | Intents & Event Listeners |
| `MyApplication6` | P-6b | Options Menu |
| `MyApplication7` | P-6c | Login Form |
| `MyApplication8` | P-7 | UI Components & Intents |
| `MyApplication9` | P-8a/b | Music & Video Player |
| `MyApplication10` | P-8c/d | Dialer & Progress Bar |
| `MyApplication11` | P-9a | Notifications |
| `MyApplication12` | P-9b | SQLite Database |
| `MyApplication13` | Extra | Popup Menu |

---

## 📂 Detailed Breakdown

<details>
<summary><b>HelloWorld — Kotlin Basics (P-1 & P-2)</b></summary>

- Hello World – `println` to console
- Arithmetic operations (add, subtract, multiply, divide, modulus)
- Number swap with temp variable
- Array of 10 integers – display first and last element
- Even / Odd checker
- Larger of two numbers
- Positive / Negative / Zero checker
- Swap without 3rd variable using `also`
- Vowel / Consonant checker
- Number reverse using `.reversed()`
- Palindrome check
- Factorial using loop (`Long` for large values)

</details>

<details>
<summary><b>MyApplication — Kotlin Logic Programs (P-3)</b></summary>

- Armstrong number checker
- GCD and LCM of two numbers (Euclidean algorithm)
- Prime number checker
- Function returning product of two numbers
- `studentDetails()` function returning a formatted String

</details>

<details>
<summary><b>MyApplication2 — Arrays & Collections (P-4)</b></summary>

- Integer array – display all elements + filter even numbers (Implicit & Explicit declaration)
- Character array – display vowels using Factory Method (`Array(size) { ... }`)

</details>

<details>
<summary><b>MyApplication3 — Android UI Basics (P-5a/b)</b></summary>

- Hello World Android app with `TextView`, `EditText`, `Button`, `Toast`
- Android Resources – `colors.xml`, `themes.xml`, `strings.xml`, Drawable, Dimension
- Button background color via `backgroundTint` (two methods)

</details>

<details>
<summary><b>MyApplication4 — Activity Lifecycle (P-5c/d)</b></summary>

- Full lifecycle demo – `onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onRestart`, `onDestroy`
- Toast message fired at each lifecycle callback
- Two-activity navigation with `Intent` + `finish()`

</details>

<details>
<summary><b>MyApplication5 — Intents & Event Listeners (P-6a)</b></summary>

- Login page → Welcome page using Explicit Intent
- Data passing via `putExtra` / `getStringExtra`
- `ArrayAdapter` + `ListView` to display a dynamic list

</details>

<details>
<summary><b>MyApplication6 — Options Menu (P-6b)</b></summary>

- Options Menu with Edit, Delete, Share items (`menu.xml`)
- `onCreateOptionsMenu` + `onOptionsItemSelected`
- Toast feedback on item selection
- `themes.xml` fix – removed `.NoActionBar` to show the toolbar

</details>

<details>
<summary><b>MyApplication7 — Login Form (P-6c)</b></summary>

- Login form with username + password (`EditText`)
- Submit validates credentials → Toast: *Correct / Incorrect*
- Reset clears all fields → Toast: *Fields Cleared*

</details>

<details>
<summary><b>MyApplication8 — UI Components & Intents (P-7)</b></summary>

- Random number generator (1–100) on button click
- Standard Calculator – `GridLayout`, all operators, decimal support, clear
- Open `www.google.com` in browser via `Intent.ACTION_VIEW`

</details>

<details>
<summary><b>MyApplication9 — Music & Video Player (P-8a/b)</b></summary>

- **Music Player** – `MediaPlayer` with Play, Pause, Stop; audio from `res/raw/`
- **Video Player** – `VideoView` + `MediaController`; video from `res/raw/`

</details>

<details>
<summary><b>MyApplication10 — Dialer & Progress Bar (P-8c/d)</b></summary>

- Dial Number app using `Intent.ACTION_DIAL` with a pre-filled number
- Progress Bar – download image from URL using `Thread` + `Handler.post` for UI update

</details>

<details>
<summary><b>MyApplication11 — Notifications (P-9a)</b></summary>

- Notification channel setup (`NotificationManager`, Android 8+)
- `POST_NOTIFICATIONS` runtime permission (Android 13+)
- `NotificationCompat.Builder` – title, body, priority, auto-cancel

</details>

<details>
<summary><b>MyApplication12 — SQLite Database (P-9b)</b></summary>

- `DBHelper` class extending `SQLiteOpenHelper`
- `CREATE TABLE students (id, name, marks)`
- Full CRUD – `insertData()`, `updateData()`, `deleteData()`, `getAllData()`
- UI with `EditText` fields + Insert / Update / Delete / View Data buttons

</details>

<details>
<summary><b>MyApplication13 — Popup Menu (Extra)</b></summary>

- Popup Menu triggered on button click
- Menu items with click listeners and Toast feedback

</details>

---

## 🧠 Concepts Covered

| Category | Concepts |
|----------|----------|
| **Kotlin** | Variables, arrays, control flow, functions, string templates, `also`, `when` |
| **Android Basics** | Activity, `setContentView`, `findViewById`, `AppCompatActivity` |
| **Lifecycle** | `onCreate` → `onStart` → `onResume` → `onPause` → `onStop` → `onDestroy` |
| **UI Components** | `TextView`, `EditText`, `Button`, `Toast`, `ListView`, `VideoView`, `ProgressBar`, `ImageView` |
| **Layouts** | `ConstraintLayout`, `LinearLayout`, `GridLayout`, `RelativeLayout` |
| **Resources** | `colors.xml`, `themes.xml`, `strings.xml`, `drawable/`, `raw/` |
| **Intents** | Explicit (Activity navigation, data passing), Implicit (URL, phone dialer) |
| **Event Listeners** | `setOnClickListener`, `setOnLongClickListener` |
| **Adapters** | `ArrayAdapter` with `ListView` |
| **Menus** | Options Menu, Popup Menu |
| **Media** | `MediaPlayer` (audio), `VideoView` + `MediaController` (video) |
| **Notifications** | `NotificationCompat.Builder`, `NotificationChannel`, runtime permissions |
| **SQLite** | `SQLiteOpenHelper`, `ContentValues`, `Cursor`, INSERT / UPDATE / DELETE / SELECT |
| **Threading** | `Thread`, `Handler(Looper.getMainLooper()).post { }` |
| **Permissions** | `CALL_PHONE`, `INTERNET`, `POST_NOTIFICATIONS` |

---

## ▶️ How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/qusai-Kagalwala/AndroidStudioProjects.git
   ```
2. Open **Android Studio** → **File** → **Open** → select a project folder (e.g. `MyApplication8`)
3. Wait for Gradle sync to complete
4. Run on an emulator (API 24+) or a physical device with **Developer Options** enabled
5. For media projects (`MyApplication9`) — ensure `song.mp3` and `sample.mp4` are present in `res/raw/`

---

## 👤 Author

**Qusai Kagalwala**  
BSc Computer Science — KC College, Mumbai (2024–2028)

[![GitHub](https://img.shields.io/badge/GitHub-qusai--Kagalwala-181717?style=flat&logo=github)](https://github.com/qusai-Kagalwala)
[![DevVault](https://img.shields.io/badge/DevVault-60+_Projects-181717?style=flat&logo=github)](https://github.com/qusai-Kagal/DevVault)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-qusai--kagalwala-0A66C2?style=flat&logo=linkedin)](https://www.linkedin.com/in/qusai-kagalwala/)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
