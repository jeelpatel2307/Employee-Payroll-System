class Employee:
    def __init__(self, emp_id, emp_name, emp_salary):
        self.emp_id = emp_id
        self.emp_name = emp_name
        self.emp_salary = emp_salary

class PayrollSystem:
    def calculate_payroll(self, employees):
        print("Calculating Payroll")
        print("===================")
        for employee in employees:
            print(f"Payroll for: {employee.emp_name}")
            print(f"- ID: {employee.emp_id}")
            print(f"- Salary: ${employee.emp_salary}")
            print("===================")

def main():
    # Create employee objects
    employee1 = Employee(1, "John Doe", 50000)
    employee2 = Employee(2, "Jane Smith", 60000)
    
    # Create a list of employees
    employees = [employee1, employee2]
    
    # Create a PayrollSystem object
    payroll_system = PayrollSystem()
    
    # Calculate payroll for the list of employees
    payroll_system.calculate_payroll(employees)

if __name__ == "__main__":
    main()
