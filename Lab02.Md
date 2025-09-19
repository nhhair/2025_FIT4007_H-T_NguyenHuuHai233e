classDiagram
    class BankAccount {
        -String accountNumber
        -double balance
        +BankAccount(accountNumber: String, balance: double)
        +getAccountNumber(): String
        +setAccountNumber(accountNumber: String): void
        +getBalance(): double
        +setBalance(balance: double): void
    }

    class Circle {
        -double radius
        -final double PI
        +Circle(radius: double)
        +Circle()
        +getRadius(): double
        +setRadius(radius: double): void
        +input(): void
        +output(): void
        +calculateArea(): double
        +calculateCircumference(): double
    }

    class MainBai1 {
        +main(args: String[]): void
    }

    class MainBai2 {
        +main(args: String[]): void
    }

    class MainBai3 {
        +main(args: String[]): void
    }

    class MainBai4 {
        +main(args: String[]): void
    }
    
    class Novel {
        -String bookId
        -String title
        -double price
        -double discount
        +Novel(bookId: String, title: String)
        +Novel(bookId: String, title: String, price: double, discount: double)
        +getBookId(): String
        +setBookId(bookId: String): void
        +getTitle(): String
        +setTitle(title: String): void
        +getPrice(): double
        +setPrice(price: double): void
        +getDiscount(): double
        +setDiscount(discount: double): void
        +getSellingPrice(): double
    }

    class Student {
        -String studentId
        -String name
        -int birthYear
        -String address
        +Student(studentId: String, name: String)
        +Student(studentId: String, name: String, birthYear: int, address: String)
        +getStudentId(): String
        +setStudentId(studentId: String): void
        +getName(): String
        +setName(name: String): void
        +getBirthYear(): int
        +setBirthYear(birthYear: int): void
        +getAddress(): String
        +setAddress(address: String): void
        +calculateAge(): int
    }

    MainBai1 ..> BankAccount : tạo đối tượng
    MainBai2 ..> Novel : tạo đối tượng
    MainBai3 ..> Student : tạo đối tượng
    MainBai4 ..> Circle : tạo đối tượng