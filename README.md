# 🛰️ OOP Satellite Control System – Java

A Java Object-Oriented Programming (OOP) project developed for the **SLIIT OOP module**, implementing **interfaces, class hierarchies, and method overriding** to simulate satellite control and tracking operations from a central Satellite Center.

---

## 📚 Project Overview

This program simulates a **Satellite Center** managing two types of satellites:
- **Drone Satellites**
- **Navigational Satellites**

Each satellite can be **activated**, **deactivated**, and **tracked** using geographic location data. The system demonstrates practical use of OOP principles including **interfaces, abstraction, polymorphism, and encapsulation**.

---

## 🧩 Class Structure Overview

### **1️⃣ Interfaces**
- **ISatellite**
  - Declares `activate()` and `deactivate()` methods for satellite control.
- **IGeoLocation**
  - Declares `displayLocation()` for showing satellite location.

### **2️⃣ Classes**
- **DroneSatellite** and **NavigationSatellite**
  - Implement `ISatellite` interface.
  - Override `activate()` and `deactivate()` methods.
  - Accept satellite name through constructors.

- **SatelliteLocation**
  - Implements `IGeoLocation` to show satellite’s geographical location.
  - Constructor accepts the satellite’s current location.

- **SatelliteCenter**
  - Manages multiple `ISatellite` and `IGeoLocation` objects.
  - Methods:
    - `startService()` → Activates satellites.
    - `stopService()` → Deactivates satellites.
    - `locationService()` → Displays locations of all satellites.
  - Uses an `option` switch to control different satellite types.

- **SatelliteDemo**
  - Main class demonstrating all functionalities:
    - Creates satellites and trackers.
    - Initializes and runs multiple `SatelliteCenter` objects.
    - Displays satellite activation, deactivation, and location tracking.

---

## ⚙️ How It Works

1. **Initialize satellites and locations**
   ```java
   ISatellite nav = new NavigationSatellite("Ravana-01");
   ISatellite drone = new DroneSatellite("Ravana-02");
   IGeoLocation loc1 = new SatelliteLocation("Sri Lanka");
   IGeoLocation loc2 = new SatelliteLocation("Russia");
