
# Taxi Booking System

## Overview

This project is a simple console-based Taxi Booking System implemented in Java. The system allows users to book taxis, view taxi details, and manage taxi trips. The main components of the system are three Java files: `Main.java`, `Taxi.java`, and `Booking.java`.

## Features

- **Book a Taxi**: Users can book a taxi by providing the pickup point, drop point, and pickup time.
- **View Taxi Details**: Users can view the details of all taxis, including their current location, total earnings, and trip history.
- **Exit**: Users can exit the program.

## Components

### Main.java

This file contains the main method and handles user interaction. It offers options for booking a taxi, printing taxi details, or exiting the program.

### Taxi.java

This file defines the `Taxi` class, representing a taxi with properties such as ID, current location, free time, total earnings, and a list of trips. It also includes methods to print taxi details and update taxi information.

### Booking.java

This file manages the list of taxis and handles the taxi booking process. It includes methods to create taxis, check for available taxis, book a taxi, and print taxi details.

## Usage

### Running the Program

1. **Compile the Java Files**: Ensure you have all three Java files (`Main.java`, `Taxi.java`, and `Booking.java`) in the same directory. Open a terminal and navigate to this directory. Compile the files using the following command:

   ```bash
   javac Main.java Taxi.java Booking.java
   ```

2. **Run the Program**: Run the compiled `Main` class:

   ```bash
   java Main
   ```

### Program Options

- **Book a Taxi**:
  - Select option `1`.
  - Enter the pickup point (A-F).
  - Enter the drop point (A-F).
  - Enter the pickup time (integer).

- **Print Taxi Details**:
  - Select option `2`.

- **Exit**:
  - Select option `3`.

## Example

```bash
Enter 1 for Booking
Enter 2 For Print Taxi Details
Enter 3 For Exit
1
Enter PickUp Point (A,B,C,D,E,F)
A
Enter Drop Point :
B
Enter PickUp Time :
9
Ticket Booked Successfully... Ticket id 1

Enter 1 for Booking
Enter 2 For Print Taxi Details
Enter 3 For Exit
2
Taxi - 1 Total Earnings - 100 Current spot - B Free Time - 10
...
```

## Improvements and Future Work

- Enhanced input validation and error handling.
- Improved user interface and experience.
- Optimization for handling a larger number of taxis and bookings.
- Additional features like canceling a booking, modifying a booking, and viewing individual taxi trip details.

## Contributing

Contributions are welcome! Please fork the repository and submit pull requests for any improvements or new features.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
