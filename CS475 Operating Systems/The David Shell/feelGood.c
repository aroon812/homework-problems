#include <stdio.h>
#include <unistd.h>
int main() {
  while (1) {
    printf("Students think your MOTD is inspiring!\n");
    sleep(4);
  }
  return 0;
}
