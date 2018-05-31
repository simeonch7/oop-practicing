package org.elsys.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private double budget;
	List<Employee> employees = new ArrayList<>();
	/**
	 * Creates company with budget provided as parameter.
	 * 
	 * @param budget
	 */
	public Company(double budget) {
		this.budget = budget;
	}

	/**
	 * Returns the budget of the company.
	 * 
	 * @return
	 */
	public double getBudget() {
		return budget;
	}

	/**
	 * Returns the remaining budget of the company - the company budget minus
	 * the salaries of all employees (including the managers).
	 * 
	 * @return
	 */
	public double getBudgetLeft() {
		for(Employee emp : employees) {
			budget -= emp.getSalary();
		}
		return budget;
	}

	/**
	 * Hires an employees in the company.
	 * 
	 * If the budget is going to be exceeded, {@link NotEnoughBudgetException}
	 * must be thrown.
	 * 
	 * @param e
	 *            the employee to be hired
	 */
	public void hire(Employee e) {
		
		if(getBudgetLeft() >=  e.getSalary()) {
			employees.add(e);
		} else throw new NotEnoughBudgetException();
	}

	/**
	 * Fires an employee.
	 * 
	 * @param e
	 *            employee to be fired
	 */
	public void fire(Employee e) {
		if(isHired(e)) employees.remove(e);
	}

	/**
	 * Checks whether the given employee is hired in the company
	 * 
	 * @param e
	 */
	public boolean isHired(Employee e) {
		return employees.contains(e);
	}

	/**
	 * Closes the company. Sets the budget to 0 and fires all employees
	 */
	public void close() {
		employees.clear();
		budget = 0;
	}

	/**
	 * Returns a list of all managers with the given level.
	 * 
	 * @param level
	 * @return
	 */
	public List<Manager> getManagersWithLevel(int level) {
		List<Manager> managers = new ArrayList<>();
		for(Employee emp : employees) {
			if(emp instanceof Manager) {
				if(((Manager)emp).getLevel() == level) {
					managers.add((Manager) emp);
				}
			}
		}
		return managers;
	}
}
