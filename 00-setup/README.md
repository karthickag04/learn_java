# 🚀 Java Environment Setup

Welcome to your Java learning journey! This section will guide you through setting up your development environment.

## 📋 Prerequisites

Before we begin coding, you need to install and configure Java on your system.

## 🔧 Installation Steps

### Step 1: Download Java SE
- Visit the official Oracle website: [Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
- Choose the appropriate version for your operating system
- For Windows: Download the `.msi` or `.exe` installer

### Step 2: Install Java
- Run the downloaded installer
- Follow the on-screen instructions
- Note the installation directory (usually `C:\Program Files\Java\jdk-XX.X.X`)

### Step 3: Configure Environment Variables
1. Locate your Java installation directory
2. Find the `bin` folder (e.g., `C:\Program Files\Java\jdk-XX.X.X\bin`)
3. Copy the path to the `bin` folder
4. Add to system PATH:
   - Open Start menu → Search "Environment Variables"
   - Click "Edit the system environment variables"
   - Click "Environment Variables" button
   - Under "System variables", find `Path` and click "Edit"
   - Click "New" and paste the `bin` folder path
   - Click "OK" to save

### Step 4: Verify Installation
Open Command Prompt and test:
```bash
java -version
javac -version
```

Both commands should display version information.

## 🛠️ IDE Setup

### Option 1: Visual Studio Code (Recommended for beginners)
1. Download from [VS Code Downloads](https://code.visualstudio.com/)
2. Install the Java Extension Pack:
   - Open VS Code
   - Go to Extensions (`Ctrl+Shift+X`)
   - Search for "Java Extension Pack"
   - Click "Install"

### Option 2: IntelliJ IDEA
1. Download from [IntelliJ IDEA Downloads](https://www.jetbrains.com/idea/download/)
2. Choose Community Edition (free)
3. Configure JDK during setup

## 🏃‍♂️ Your First Java Program

Create a file called `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java Programming!");
    }
}
```

## 🔨 Compiling and Running

### Using Command Line:
```bash
# Compile the program
javac HelloWorld.java

# Run the program
java HelloWorld
```

### Using VS Code:
1. Open the Java file
2. Press `F5` or click the "Run" button
3. Output appears in the terminal

### Using IntelliJ IDEA:
1. Right-click on the file
2. Select "Run 'HelloWorld.main()'"
3. Output appears in the Run window

## ✅ Verification Checklist

- [ ] Java JDK installed
- [ ] `java -version` works
- [ ] `javac -version` works
- [ ] IDE installed with Java support
- [ ] HelloWorld program compiles and runs
- [ ] Output displays correctly

## 🔗 Next Steps

Once your environment is set up:
1. Proceed to [01-fundamentals](../01-fundamentals/) to learn Java basics
2. Practice with the HelloWorld program variations
3. Get familiar with your chosen IDE

## 🆘 Troubleshooting

### Common Issues:
- **"java is not recognized"**: Environment PATH not set correctly
- **"javac is not recognized"**: JDK not installed (only JRE)
- **Compilation errors**: Check syntax and file name matches class name

### Getting Help:
- Check the official [Java Documentation](https://docs.oracle.com/en/java/)
- Visit [Stack Overflow](https://stackoverflow.com/questions/tagged/java)
- Ask in Java programming communities

---

**You're ready to start coding! 🎉**
