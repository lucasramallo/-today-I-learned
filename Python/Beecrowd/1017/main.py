time = input()
velocity = input()

time = int(time)
velocity = int(velocity)

kilometersPerliter = 12

km = time * velocity

result = km / kilometersPerliter

print("%.3f" % result)