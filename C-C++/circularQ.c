#include <stdio.h>
#include <stdlib.h>

void main()
{
    int maxsize;
    int front = -1, rear = -1;
    printf("*********ARRAY IMPLEMENTATION OF CIRCULAR QUEUE*********");
    printf("\nEnter The Size of the Array : ");
    scanf("%d", &maxsize);
    int cq[maxsize];
    int choice;
    while (1)
    {
        printf("-----------------------------------------------\n");
        printf("1.Enqueue \n");
        printf("2.Dequeue \n");
        printf("3.Display queue \n");
        printf("4.Quit \n");
        printf("Enter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:
              if ((front == rear + 1) || (front == 0 && rear == maxsize - 1))
                printf("\n Queue is full!! \n");
            else {
                    int element;
                    printf("Enter the element : ");
                    scanf("%d", &element);
                    if (front == -1) front = 0;
                        rear = (rear + 1) % maxsize;
                    cq[rear] = element;
                    printf("\n Inserted -> %d \n", element);
                }
            break;
            case 2:
                if (front == -1) {
                    printf("\n Queue is empty !! \n");
                } else {
                    int element;
                    element = cq[front];
                    if (front == rear) {
                        front = -1;
                        rear = -1;
                    } 
                // Q has only one element, so we reset the 
                // queue after dequeing it. ?
                    else {
                        front = (front + 1) % maxsize;
                    }
                printf("\n Deleted element -> %d \n", element);
                }
            break;
            case 3:
                if (front == -1)
                    printf(" \n Empty Queue\n");
                else {
                    int im;
                    printf("\n Front -> %d ", front);
                    printf("\n Items -> ");
                    for ( im = front; im != rear; im = (im + 1) % maxsize) {
                    printf("%d ", cq[im]);
                }
                printf("%d ", cq[im]);
                printf("\n Rear -> %d \n", rear);
                }
            break;
            case 4:
            exit(1);
            default:
            printf("Wrong choice \n");
        }
    }
}