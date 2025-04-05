# 📒 ContactBook

A clean, production-grade **Contact Book** application built in **Java**, using well-structured design patterns like **Service Layer**, **Factory**, and optionally **HashMap** for optimized performance.

> ✅ Designed for maintainability, testability (JUnit), and scalability.

---

## ✨ Features

- 🔍 Add, view, search, and delete contacts
- 🧪 Unit-tested with **JUnit 5**
- 🧩 Interface-driven architecture for easy extension
- 💡 Clean code with SOLID principles and best practices

---

## 🧱 Tech Stack

| Layer         | Technology      |
|---------------|------------------|
| Language       | Java 17+         |
| Build Tool     | Maven            |
| Testing        | JUnit 5 + Mockito |
| Data Structure | HashMap / Trie / TreeMap |
| IDE            | VS Code / IntelliJ IDEA |

---

## 📂 Project Structure
```bash
ContactBook/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── olixstudios/
│   │               └── contactbook/
│   │                   ├── model/
│   │                   ├── service/
│   │                   ├── serviceImpl/
│   │                   └── utils/
│   └── test/
│       └── java/
│           └── com/olixstudios/contactbook/
│               └── service/
├── pom.xml
└── README.md

```
---

## 🚀 Getting Started

### 1. Clone the Repository

git clone https://github.com/OlixIgnacious/ContactBook.git <br>
cd ContactBook

### 2. Build the Project

mvn clean install

### 3. Run the Application

mvn exec:java -Dexec.mainClass="com.olixstudios.contactbook.Main"

### 🧪 Running Tests

mvn test

---

🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you’d like to change.

---

📄 License

This project is open source and available under the MIT License.

---

🙋‍♂️ Author

OlixIgnacious
📫 Visit [Github](https://github.com/olixignacious)


