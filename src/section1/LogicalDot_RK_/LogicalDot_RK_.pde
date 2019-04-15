void setup() {

  size(800, 800);
}

void draw() {
  if (mousePressed) {
    fill(#0514AD);
  } else {
    fill(#50164F);
  }
  ellipse(400, 400, 400, 400);
}