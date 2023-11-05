# BasicBankingSystem
The provided Java project is a simple command-line-based banking system. It includes functionalities for managing accounts, performing banking operations, and storing data temporarily. Here's an overview:

### Project Components:

1. **Classes:**
    - `MainLogic`: This class is the heart of the banking system. It handles user interactions, displays the menu, and orchestrates various operations based on user input.
    - `Account`: Represents a bank account, holding information such as the account holder's name, balance, and PIN (Personal Identification Number).
    - `DataBase`: Manages a collection of `Account` objects and handles operations related to account management, such as adding, retrieving, and showing account details.

2. **Functionality:**
    - **Menu Display and User Input:**
        - The `MainLogic` class is responsible for displaying a welcome message and a menu with different options.
        - It uses a `Scanner` to receive user input for various operations.

    - **Account Operations:**
        - Viewing balance: Users can check the balance by providing their username and PIN.
        - Deposit and Withdraw: Users can deposit or withdraw funds by providing their username, PIN, and the amount.
        - Create new account: Users can create a new account by entering a username and PIN.
        - Show Accounts: Displays all existing accounts in the database.

    - **Validation and Error Handling:**
        - The system validates the input and checks for the existence of accounts before executing operations like viewing balance, depositing, or withdrawing funds.
        - It verifies the entered PIN against the stored PIN for authentication.

    - **Exit Functionality:**
        - Users can exit the application by selecting the exit option in the menu.
3. **Note** : When running the program, please be aware that the database starts empty each time, requiring new accounts to be created or added during the session for testing or demonstration purposes.
This project provides a foundation for a simple banking system, but additional improvements could be made to refine its functionalities and security measures.
