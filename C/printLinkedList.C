#include<stdio.h>
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
  printf("Original Order:\n");
  while(temp != NULL) {
    printf("%d ", temp -> num);
    temp = temp -> next;
  }
}
void printreverse() {
  struct node* temp = (struct node*)malloc(sizeof(struct node));
  temp = last;
  printf("\nReverse Order:\n");
  while(temp != NULL) {
    printf("%d ", temp -> num);
    temp = temp -> prev;
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
  if(numOfNodes) {
    printoriginal();
    printreverse();
  } else {
    printf("No value has been inserted");
  }
  return 0;
}
