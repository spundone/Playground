#include <stdio.h>
#include <string.h>
#define N 20
typedef struct
{
    int top;
    char a[N];
}stack;
void push (stack *s, int ele)
{
    if(s->top==N-1)
        {
            printf("Stack Overflow.\n");
        }
    else
    {
        s->top++;
        s->a[s->top]=ele;
    }
}
char pop (stack *s)
{
    char x;
    x=s->a[s->top];
    s->top--;
    return x;
}
int isempty(stack *s)
{
    if(s->top==-1)
        return 1;
    else 
        return 0;
}
int isoperand(char x)
{
    if(x>='A' && x<='Z' || x>='a' && x<='z')
        return 1;
    else
        {return 0;}
}
int isoperator(char x)
{
    if(x=='+' || x=='-' || x=='*' || x=='/' || x=='^')
        return 1;
    else
        {return 0;}
}
int priority(char x)
{
    if (x=='(' || x==')')
        return 4;
    if (x=='^')
        return 3;
    if (x=='*' || x=='/')
        return 2;
    if (x=='+' || x=='-')
        return 1;    
}
char stacktop(stack *s)
{
    return(s->a[s->top]);
}
void convert(char infix[], char postfix[])
{
    stack s;
    s.top = -1;
    char x,ele;
    int i,k=0;
    for(i=0;i<strlen(infix);i++)
    {
        x=infix[i];
        if(isoperand(x))
            postfix[k++]=x;
        if(x=='(')
            push(&s,x);
        if(isoperator(x))
        {
            while(priority(x)<=priority(stacktop(&s)))
            {
                ele=pop(&s);
                postfix[k++]=ele;
            }
            push(&s,x);
        }
        if(x==')')          // x=')'
        {
            while(stacktop(&s)!='(')
            {
                ele=pop(&s);
                postfix[k++]=ele;
            }
            ele=pop(&s);
        }
    }
    while(isempty(&s)==0)
    {
        ele=pop(&s);
        postfix[k++]=ele;
    }
    postfix[k]='\0';
}
int main()
{
    char infix[20], postfix[20];
    printf("Enter infix expression.\n");
    gets(infix);
    convert(infix,postfix);
    printf("\nPostfix expression = %s",postfix);
    return 0;
}