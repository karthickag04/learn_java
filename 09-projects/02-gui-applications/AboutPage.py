import tkinter as tk
from tkinter import messagebox

class AboutPage(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("About Us")
        self.geometry("1400x250")
        self.configure(bg="#f0f0f0")
        self.resizable(False, False)

        # App Name
        tk.Label(self, text="My Application", font=("Arial", 16, "bold"), bg="#f0f0f0").pack(pady=10)

        # Version
        tk.Label(self, text="Version 1.0.0", font=("Arial", 12), bg="#f0f0f0").pack(pady=5)

        # Description
        description = (
            "This application is developed using Python and Tkinter.\n"
            "It serves as a demo for creating GUI-based About Pages.\n"
            "Feel free to customize it for your own project."
        )
        tk.Label(self, text=description, font=("Arial", 10), bg="#f0f0f0", justify="center").pack(pady=10)

        # OK Button
        tk.Button(self, text="OK", width=10, command=self.destroy).pack(pady=15)

# Run the about page
if __name__ == "__main__":
    app = AboutPage()
    app.mainloop()
