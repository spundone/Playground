#include <stdio.h>
#define N 20
typedef struct stack
{
    int a[N];
    int top;
}stack;
void push(stack *s, int ele)
{
    if(s->top==N-1)
    {
        printf("\nStack Overflow.\n");
    }
    else
    {
        s->top++;
        s->a[s->top]=ele;
    }
}
int isempty(stack *s)
{
    if(s->top==-1)
        return 1;
    else
    {
        return 0;
    }  
}
int stacktop(stack *s)
{
    if(isempty(s))
        return 1;
    else
    {
        return s->a[s->top];
    }
}
int pop(stack *s)
{
    int x;
    if(isempty(s))
        return -1;
    else
    {
        x=s->a[s->top];
        s->top--;
        return x;
    }
}
void display(stack *s)
{
    int i;
    if(isempty(s))
        printf("\nStack is empty.\n");
    else
    {
        for(i=s->top;i>=0;i--)
        {
            printf("%d\t",s->a[i]);
        }
    }
}
int main()
{
    int ch,ele;
    stack s;
    s.top== -1;
    while(1)
    {
        printf("\n1.Push\n2.Pop\n3.Stacktop\n4.Display\n5.Exit\n");
        printf("Enter Choice.\n");
        scanf("%d",&ch);
        if(ch==5)
            break;
        switch(ch)
        {
            case 1:
            {
                printf("Enter element to be pushed.\n");
                scanf("%d",&ele);
                push(&s,ele);
            }
            break;
            case 2:
            {
                ele=pop(&s);
                if(ele==-1)
                    printf("\nStack underflow.\n");
                else
                {
                    printf("\nElement popped=%d\n",ele);
                }
            }
            break;
            case 3:
            {
                stacktop(&s);
                if(ele==-1)
                    printf("Stack is Empty.\n");
                else
                {
                    printf("Stacktop element = %d\n",ele);
                }
            }
            break;
            case 4:
            {
                display(&s);
            }
            break; 
            default:
                printf("\nInvalid Choice.\n");
        }
    }
    return 0;
}
