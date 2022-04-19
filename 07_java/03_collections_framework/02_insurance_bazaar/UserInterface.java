package com.ui;

import com.utility.*;

import java.util.*;
import java.util.Map.Entry;

public class UserInterface {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    // Fill the UI code

    Bazaar bazaar = new Bazaar();
    bazaar.setPolicyMap(new TreeMap<>(new PolicyIdComparator()));

    System.out.println("Enter the no of Policy names you want to store");
    int counter = Integer.parseInt(in.nextLine());

    while ((counter--) != 0) {
      System.out.println("Enter the Policy ID");
      int policyId = Integer.parseInt(in.nextLine());

      System.out.println("Enter the Policy Name");
      String policyName = in.nextLine();

      bazaar.addPolicyDetails(policyId, policyName);
    }

    for (Entry<Integer, String> policy : bazaar.getPolicyMap().entrySet()) {
      System.out.println(String.format("%d %s", policy.getKey(), policy.getValue()));
    }

    System.out.println("Enter the policy type to be searched");
    String policyType = in.nextLine();

    for (Integer policyId : bazaar.searchBasedOnPolicyType(policyType)) {
      System.out.println(policyId);
    }
  }

}

class PolicyIdComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o1.compareTo(o2);
  }

}
