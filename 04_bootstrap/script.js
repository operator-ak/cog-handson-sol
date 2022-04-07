function getCoreCost(core) {
  if (core === "2 cores") return 20000;
  if (core === "4 cores") return 25000;
  if (core === "6 cores") return 30000;
  if (core === "8 cores") return 40000;

  return 0;
}

function getConfigurationCost(config) {
  if (config === "4 GB RAM , 300 GB SSD-boosted Disk Storage") return 5000;
  if (config === "10 GB RAM , 700 GB SSD-boosted Disk Storage") return 10000;
  if (config === "12 GB RAM , 1400 GB SSD-boosted Disk Storage") return 15000;

  return 0;
}

function calculateTax(totalcost, pytpe) {
  const totalAmount = totalcost + (totalcost * 12 / 100);

  if (pytpe === "Card") {
    const totalTax = totalAmount + (totalAmount * 2 / 100);
    return totalTax;
  }

  if (pytpe === "Cash") {
    return totalAmount;
  }
}

function calculatePurchaseCost() {
  const core = document.getElementById("model").value;
  const config = document.getElementById("config").value;
  const ptype = document.getElementById("ptype").value;

  const coreCost = getCoreCost(core);
  const configCost = getConfigurationCost(config);

  const totalcost = coreCost + configCost;

  const tax = calculateTax(totalcost, ptype);

  document.getElementById("result").innerHTML = "Purchase of a Storage Server with " + config + " has been logged! <br/> An amount of Rs." + Math.round(tax) + ", inclusive of tax has been received by " + pytpe;

  return false;
}