#include <stdio.h>
#include <stdlib.h>

struct Hello
{
	int number;
	struct Hello *next;
};

void push(struct Hello* current, int number);
int pop(struct Hello* current);

int main(){
	int i;
	struct Hello *firstNumber;
	firstNumber = malloc(sizeof(struct Hello));
	firstNumber->number = 1;
	firstNumber->next = NULL;


	for (i = 1; i < 100000000; i++)
	{
		push(&firstNumber, i);
		if (i % 10000 == 0)
		{

		printf("%d\n", pop(&firstNumber));//1
		}
		pop(&firstNumber);
	}

	for (i = 0; i < 11; i++)
	{
	}

	return 0;
}

int pop(struct Hello **current){
	if (*current == NULL)
	{
		return -1;
	}
	int number = (*current)->number;

	struct Hello *first = *current;
	*current = first->next;
	//free(first);
	return number;
}

void push(struct Hello** current, int number){
	struct Hello *newItem = malloc(sizeof(struct Hello));

	newItem->number = number;
	newItem->next = *current;
	*current = newItem;

	return;
}
