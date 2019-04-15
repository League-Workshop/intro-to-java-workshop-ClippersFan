PImage mustache;
PImage friend;

void setup() {
 
  size(800,800);
    friend = loadImage ("friend.png");
    friend.resize(800,800);
    mustache = loadImage ("hi.png");
    mustache.resize(400,400);
    
    
}
void draw() {
  background(friend);
  if(mousePressed)
  image(mustache, mouseX, mouseY);
 
  
    
  
}