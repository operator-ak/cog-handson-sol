const _principalAmount = document.getElementById("principalAmount");
const _interestRate = document.getElementById("interestRate");
const _tenure = document.getElementById("tenure");

function EstimateReducingInterestLoan() {
  calculateEMI();
  totalPayment();
  totalInterest();
  EstimateFixedInterestLoan();
}

function EstimateFixedInterestLoan() {
  const principalAmount = Number(_principalAmount.value);
  const interestRate = Number(_interestRate.value);
  const tenure_years = Number(_tenure.value) / 12;

  const totalInterest = principalAmount * interestRate * tenure_years / 100;

  const totalPayment = principalAmount + totalInterest;

  const EMI = totalPayment / (tenure_years * 12);

  document.getElementById("tInterestFixed").innerHTML = totalInterest.toFixed(2);
  document.getElementById("tPaymentFixed").innerHTML = totalPayment.toFixed(2);
  document.getElementById("EMIFixed").innerHTML = EMI.toFixed(2);
}

function calculateEMI() {
  const P = Number(_principalAmount.value);
  const r = Number(_interestRate.value);
  const N = Number(_tenure.value);

  const R = (r / 100) / 12;

  const EMI = P * R * (Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1));

  document.getElementById("EMI").innerHTML = EMI.toFixed(2);
}


function totalPayment() {
  const P = Number(_principalAmount.value);
  const r = Number(_interestRate.value);
  const tenure_months = Number(_tenure.value);

  const R = (r / 100) / 12;

  const EMI = P * R * (Math.pow((1 + R), tenure_months) / (Math.pow((1 + R), tenure_months) - 1));

  const totalPayment = EMI * tenure_months;

  document.getElementById("tPayment").innerHTML = totalPayment.toFixed(2);
}

function totalInterest() {
  const princialAmount = Number(_principalAmount.value);
  const r = Number(_interestRate.value);
  const N = Number(_tenure.value);

  const R = (r / 100) / 12;

  const EMI = princialAmount * R * (Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1));

  const totalPayment = EMI * N;

  const totalInterest = totalPayment - princialAmount;

  document.getElementById("tInterest").innerHTML = totalInterest.toFixed(2);
}