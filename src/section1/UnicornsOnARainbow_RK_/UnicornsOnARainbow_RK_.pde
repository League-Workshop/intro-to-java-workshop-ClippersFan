PImage rainbow;
  PImage unicorn;
  

void setup() {
  rainbow = loadImage ("rain.jpeg");
    size(800, 600);
    rainbow.resize(800,600);
  unicorn = loadImage("unic.png");
    unicorn.resize(400,300);
}
void draw() {
  background(rainbow);
image(unicorn, mouseX, mouseY);
}