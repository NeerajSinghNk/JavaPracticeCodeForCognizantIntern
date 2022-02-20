package com.ui;

import com.utility.Bazaar;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of policy names you want to store");
		int n = Integer.parseInt(sc.nextLine());
		Bazaar bazaar = new Bazaar();
		bazaar.setPolicyMap(new TreeMap<>());

		for(int i=0;i<n;i++){
			System.out.println("Enter the Policy ID");
			int policyId = Integer.parseInt(sc.nextLine());

			System.out.println("Enter the Policy Name");
			String policyName = sc.nextLine();

			bazaar.addPolicyDetails(policyId, policyName);
		}

		Map<Integer, String> policyMap = bazaar.getPolicyMap();

		for(Map.Entry<Integer, String> policy : policyMap.entrySet()){
			System.out.println(policy.getKey() + " " + policy.getValue());
		}

		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		
		List<Integer> policies = bazaar.searchBasedOnPolicyType(policyType);
		for(int policy : policies){
			System.out.println(policy);
		}

	}

}
