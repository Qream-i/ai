import csv

rf = open ("./basic4/a.csv", "r")
wf = open ("./basic4/a_copy.scv", "w")

r=csv.reader(rf)
w=csv.writer(wf)