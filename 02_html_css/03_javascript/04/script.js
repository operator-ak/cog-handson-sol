function OrderCake(str) {
  const wtInGrams = str.substring(0, 4);
  const flavor = str.substring(4, str.length - 3);
  const orderId = str.substring(str.length - 3);

  const wtInKg = (Number(wtInGrams) / 1000);
  const cost = 450 * wtInKg;

  return "Your order for " + Math.round(wtInKg) + " kg " + flavor + " cake has been taken. You are requested to pay Rs. " + Math.round(cost) + " on the order no " + orderId;
}

console.log(OrderCake("5848ButterBlast485"));
