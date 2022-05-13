package com.utility;

import com.ui.*;
import java.util.*;
import java.util.Map.Entry;

public class Bazaar {

  private Map<Integer, String> policyMap;

  public Map<Integer, String> getPolicyMap() {
    return policyMap;
  }

  public void setPolicyMap(Map<Integer, String> policyMap) {
    this.policyMap = policyMap;
  }

  public void addPolicyDetails(int policyId, String policyName) {
    policyMap.put(policyId, policyName);
  }

  public List<Integer> searchBasedOnPolicyType(String policyType) {
    List<Integer> result = new ArrayList<>();

    for (Entry<Integer, String> policy : policyMap.entrySet()) {
      if (policy.getValue().contains(policyType)) {
        result.add(policy.getKey());
      }
    }

    return result;

  }
}
