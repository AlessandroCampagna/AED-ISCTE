
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
 char* error_msg[] = {
 "Comando incorreto\n",
 "Erro no fork\n"
 };

 void print_error(int msg_num, int exit_code);

 int main(int* argc, char** argv) {
 if (argc != 2) print_error(argv[0],0,2);
 switch (pid = fork()) {
 case -1:
 print_error(argv[0],1,3);
 exit(2);
 case 0:
 printf("Sou o processo filho\n");
 if (!fork()) {
 "Sou o processo neto\n");
 return 5;
 }
 sleep(atoi(argv[1])/2);
 return 10;
 default:
 printf("Sou o processo pai\n");
 sleep(atoi(*(argv+1)));
 return 20;
 }
 }
 void print_error(char * msg, int error_index, int
exit_code) {
 fprintf(stderr, "%s: s", msg, error_msg[error_index]);
 exit(exit_code);
 }