int elwidth = 1;
int wlwdirection = 1;
int rint = 70;
int bint = 140;
int gint = 255;
int Rdirection = 1;
int Gdirection = 1;
int Bdirection = 1;
float elx = 960;
float ely = 540;
float elx1 = 960;
float ely1 = 540;
float elx2 = 960;
float ely2 = 540;
void setup () {
 fullScreen();
  stroke(0,0,255);
}

void draw () {
  noStroke();
  fill(0,0,0,10);
  rect(0,0,width,height);
  fill(rint,gint,bint,45);
  elx = elx + random(-20,20);
  ely = ely + random(-20,20);
  elx1 = elx1 + random(-20,20);
  ely1 = ely1 + random(-20,20);
  elx2 = elx2 + random(-20,20);
  ely2 = ely2 + random(-20,20);
ellipse(elx,ely, elwidth, elwidth);
ellipse(elx1,ely1, elwidth, elwidth);
ellipse(elx2,ely2, elwidth, elwidth);
  
  
  if(elx == 1920) {
    elx = 960;
  }
   if(elx1 == 1920) {
    elx = 960;
  }
   if(elx2 == 1920) {
    elx = 960;
  }
  if(ely == 1080) {
    ely = 540;
  }
  if(ely1 == 1080) {
    ely1 = 540;
  }
  if(ely2 == 1080) {
    ely2 = 540;
  }
  
  
  
  
  
  
  
  
  
  
  
  if (wlwdirection == 1 ){
    elwidth = elwidth + 1;
 }
 else {
   elwidth = elwidth - 1;
 }
 if (elwidth == 80) {
   wlwdirection = 2;
}
if (elwidth == 10) {
  wlwdirection =1;
}






 if (rint == 255) {
    Rdirection = 2;
  }
   if (gint == 255) {
    Gdirection = 2;
  }
   if (bint == 255) {
    Bdirection = 2;
  }
   if (rint == 0) {
    Rdirection = 1;
  } 
  if (gint == 0) {
    Gdirection = 1;
  } 
  if (bint == 0) {
    Bdirection = 1;
  }
  if (Rdirection == 1) {
  rint = rint + 1;
  }
  else {
    rint = rint - 1;}
  if (Gdirection == 1) {
  gint = gint + 1;
  }
  else {
    gint = gint - 1;
  }
  if (Bdirection == 1) {
  bint = bint + 1;
  }
  else {
    bint = bint - 1;
  }
  delay(50);
}