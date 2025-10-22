<div style="margin-bottom: 20px;">
<div class="header">
    <h3>Introduction to Software Engineering</h3>
    <h4>AIECS - Lab 01</h4>
</div>
</div>
<div style="text-align: right; font-style: italic; margin-bottom: 20px;">
    <p>Start date: 29 October, 2025.<br>
    Due date: 04 October, 2025.</p>
</div>

# Installation
Softwares needed:
- [Git for (Windows/Linux)]([https://](https://git-scm.com/downloads))
- [Visual studio code](https://code.visualstudio.com/Download)

# Task 1: Setting Up And Configure Git
Using git for the first time you need to config user.name and user.email:

```terminal
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```
Replace "Your Name" and "you@example.com" with your actual name and email address.
Make sure to use the double quotes around your name and email address if they contain spaces or special characters.
You can verify your configuration by running:

```terminal
git config --global --list
```
This will display the current configuration settings for git, including your user name and email.

## Task 2: Setup account Gitlab
Go to gitlab.com and signup an account.
Registering individual account

While registering account there will be a lots of questions.
Make sure that you choose "Just me" option.

## Task 3: Create project in Gitlab
- create using gitlab web interface.
- create using VS Code interface.

## Task 4: Create project in local machine
- setup a project
- push code to git

```terminal
git init
git add .
git commit -m "Initial commit"
git remote add origin <repository_url>
git push -u origin master
```

Replace `<repository_url>` with the URL of your GitLab repository.
This will initialize a new git repository, add all files, commit them with a message, link the local repository to the remote GitLab repository, and push the changes.

# Task 5: Add Java Hello World Program
Create a simple Java program that prints "Hello, World!" to the console.

```java
import static java.lang.System.out;
public class HelloWorld {
    public static void main(String[] args) {
        out.println("Hello, World!");
    }
}
```

Save this code in a file named `HelloWorld.java`.
Compile and run the program to ensure it works correctly:

```terminal
javac HelloWorld.java
java HelloWorld
```

Then, add, commit, and push the changes to your GitLab repository:

```terminal
git add HelloWorld.java
git commit -m "Add Hello World Java program"
git push
```

Finally, submit the GitLab repository link through the LMS system.