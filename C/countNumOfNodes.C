#include<stdlib.h>
#include<stdio.h>
using namespace std;
struct node {
  int num;
  struct node* prev;
  struct node* next;
};
struct node* start;
struct node* last;
void insert(int val) {
  struct node* newnode = (struct node*)malloc(sizeof(struct node));
  newnode -> num = val;
  newnode -> next = NULL;
  newnode -> prev = last;
  if(start == NULL) {
    start = last = newnode;
  } else {
    last -> next = newnode;
  }
  last = newnode;
}
void printoriginal() {
  struct node* temp = (struct node*)malloc(sizeof(struct node));
  temp = start;
  while(temp != NULL) {
    printf("%d ", temp -> num);
    temp = temp -> next;
  }
}

int main()
{
  int i = 0;
  int numOfNodes = 0;
  while(i >= 0) {
    scanf("%d", &i);
    if(i >= 0) {
      insert(i);
      numOfNodes++;
    }
  }
  printf("There are %d values present in the list and the values are\n", numOfNodes);
  printoriginal();
  return 0;
}
