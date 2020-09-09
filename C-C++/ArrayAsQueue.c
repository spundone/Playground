#include <stdio.h>
#include <stdlib.h>

void main()
{
    int maxsize;
    int rear = - 1;
    int front = - 1;
    printf("*********ARRAY IMPLEMENTATION OF QUEUE*********");
    printf("\nEnter The Size of the Array : ");
    scanf("%d", &maxsize);
    int queue_array[maxsize];
    int choice;
    while (1)
    {
        printf("------------------------------------------------\n");
        printf("1.Insert element to queue \n");
        printf("2.Delete element from queue \n");
        printf("3.Display all elements of queue \n");
        printf("4.Quit \n");
        printf("Enter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:
                if (rear == maxsize - 1)
                    printf("Queue Overflow \n");
                else
                {
                    if (front == - 1)
                    /*If queue is initially empty */
                        front = 0;
                    int add_item;
                    printf("Insert the element in queue : ");
                    scanf("%d", &add_item);
                    rear++;
                    queue_array[rear] = add_item;
                }
            break;
            case 2:
                if (front == - 1 || front > rear)
                {
                    printf("Queue Underflow \n");
                }
                else
                {   
                    printf("Element deleted from queue is : %d\n", queue_array[front]);
                    front++;
                }
            break;
            case 3:
                if (front == - 1)
                    printf("Queue is empty \n");
                else
                {
                    int i;
                    printf("The Size of the Queue is : %d\n", maxsize);
                    printf("Queue is : ");
                    for (i = front; i <= rear; i++)
                        printf("%d ", queue_array[i]);
                    printf("\n");
                }
            break;
            case 4:
            exit(1);
            default:
            printf("Wrong choice \n");
        } 
    } 
} 