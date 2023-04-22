import math

seconds = input()
seconds = int(seconds)

secundsinMinutes = math.trunc(seconds / 60)

inMinutes = math.trunc((seconds / 60) % 60)

inhours = math.trunc(secundsinMinutes / 60)
inSeconds = math.trunc(seconds % 60)

print("{}:{}:{}".format(inhours, inMinutes, inSeconds))




