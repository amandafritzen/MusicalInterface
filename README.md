# 🎼 Instrument Interface Project

## 🧩 Objective
This project demonstrates how **interfaces** in Java promote flexibility and polymorphism.  
It shows how different musical instruments can share the same behaviors — `tune()`, `play()`, and `stop()` — while performing them uniquely.

---

## 🎶 Theme: Musical Instruments
The `Instrument` interface defines three common methods:
```java
public interface Instrument {
    void play();
    void tune();
    void stop();
}

🚀 How to Run
1. Clone this repository.
2. Add `.wav` sound files inside the `sounds/` folder.
3. Open the project in **IntelliJ IDEA**.
4. Run `InstrumentDriver.java`.