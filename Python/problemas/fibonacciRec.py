import time

def run():
    index_str = input("Digite o Index > ")
    index = int(index_str.strip())

    start_time = time.time()
    result = fib(index - 1)
    end_time = time.time()

    time_in_seconds = end_time - start_time

    print("Resultado:", result)
    print("Tempo de execução:", time_in_seconds, "segundos")

def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n - 1) + fib(n - 2)

run()