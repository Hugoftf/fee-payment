package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("ndividual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Hearlth expenditures: ");
				double healthExpenditures = sc.nextDouble();
				TaxPayer tp = new Individual(name, anualIncome, healthExpenditures);
				list.add(tp);
				
			}
			if (ch == 'c') {
				System.out.print("Number Employees: ");
				int numberEmployees = sc.nextInt();
				TaxPayer tp = new Company(name, anualIncome, numberEmployees);
				list.add(tp);
			}
			System.out.println();
		}
		
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for (TaxPayer TaxPayer : list) {
			System.out.println(TaxPayer.toString());
			sum += TaxPayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		
		
		sc.close();

	}

}
