import socket
import os
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
server_socket.bind(("", 5000))
server_socket.listen(5)
client_socket, address = server_socket.accept()
while (1):
  #fileName = client_socket.recv(1024)
	#print fileName
	fname = '../Downloads/'+"haha.jpg"
	#response=client_socket.recv(3)
	fp = open(fname,'w')
	while True:
		strng = client_socket.recv(512)
		if not strng:
			break
		fp.write(strng)
	fp.close()
	print "Data Received successfully"
	exit()
