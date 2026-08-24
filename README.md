# MAD Practical 2A – Activity Life Cycle & Basic UI

## 📱 Mobile Application Development

This practical demonstrates the **Android Activity Life Cycle** and basic **User Interface (UI)** components using Android Studio and Kotlin.

## 🎯 Aim

Create an Android application to demonstrate the functions of the **Activity Life Cycle** and **Basic UI**.

The application displays **"Hello World"** in the center of the Activity screen with a customized background, text color, font size, and text style. The Activity Life Cycle methods are demonstrated using **Log messages, Toast messages, and Snackbar messages**.

---

# 📚 Practical Description

## 1. Basic UI – Hello World

Create an Activity containing a `TextView` that displays:

```text
Hello World
```

The TextView is positioned at the **center of the Activity screen**.

### TextView Properties

| Property | Value |
|---|---|
| Text | Hello World |
| Text Color | Holo Blue Bright |
| Text Size | 27sp |
| Text Style | Bold + Italic |
| Layout Background | Yellow |
| Alignment | Center |

### XML Properties

```xml
android:background="#FFFF00"
android:textColor="@android:color/holo_blue_bright"
android:textSize="27sp"
android:textStyle="bold|italic"
```

---

# 🔄 2. Activity Life Cycle

The Android Activity Life Cycle represents the different states through which an Activity passes during its lifetime.

The following Activity Life Cycle methods are demonstrated:

```text
onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestroy()
```

Each method is implemented in the Activity and its execution is displayed using **Logcat**.

---

# 📝 3. Log Message

`Log` is used to display messages in **Android Logcat**.

Example:

```kotlin
Log.d("MainActivity", "onCreate called")
```

The messages help us understand when each Activity Life Cycle method is executed.

---

# 🍞 4. Toast Message

A **Toast** is a small temporary message displayed on the screen.

Example:

```kotlin
Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show()
```

Toast messages are used to demonstrate Activity Life Cycle events.

---

# 📢 5. Snackbar Message

A **Snackbar** displays a short message at the bottom of the screen.

Example:

```kotlin
Snackbar.make(
    findViewById(android.R.id.content),
    "onResume called",
    Snackbar.LENGTH_SHORT
).show()
```

Snackbar is useful for displaying temporary messages and user feedback.

---

# 🎨 6. ConstraintLayout

The Activity UI uses **ConstraintLayout** to position the TextView.

ConstraintLayout allows UI elements to be positioned relative to:

- Parent layout
- Other views
- Horizontal constraints
- Vertical constraints

The TextView is constrained to the center of the Activity.

---

# 🆔 7. TextView ID

An ID is generated for the TextView so that it can be accessed from Kotlin code.

Example:

```xml
android:id="@+id/textView"
```

The generated ID can then be accessed in Kotlin using:

```kotlin
findViewById(R.id.textView)
```

---

# 📱 Application Features

The application demonstrates:

- Basic Android UI
- TextView
- TextView properties
- ConstraintLayout
- Android built-in colors
- Activity Life Cycle
- Logcat messages
- Toast messages
- Snackbar messages
- View ID generation

---

# 🛠️ Technologies Used

- **Language:** Kotlin
- **IDE:** Android Studio
- **Platform:** Android
- **UI:** XML
- **Layout:** ConstraintLayout
- **Version Control:** Git & GitHub

---

# 📂 Project Structure

```text
24012021038_MAD_PR2
│
├── app
│   └── src
│       └── main
│           ├── java
│           │   └── MainActivity.kt
│           │
│           ├── res
│           │   ├── layout
│           │   │   └── activity_main.xml
│           │   └── values
│           │
│           └── AndroidManifest.xml
│
└── README.md
```

---

# 🎓 Learning Outcomes

After completing this practical, the student will be able to:

- Understand the Android Activity Life Cycle.
- Create a basic Android Activity.
- Design a basic UI using XML.
- Use and customize a TextView.
- Use ConstraintLayout.
- Generate and use View IDs.
- Use Android built-in resources.
- Display messages using Toast.
- Display messages using Snackbar.
- Use `Log` to display messages in Logcat.
- Understand when Activity Life Cycle methods are called.

---

# 👨‍💻 Author

**Jayshil Patel**

B.Tech – Information Technology  
Ganpat University

---

## 🔗 Repository

**24012021038_MAD_PR2**

This repository contains the Android application developed for **MAD Practical 2A – Activity Life Cycle and Basic UI**.
