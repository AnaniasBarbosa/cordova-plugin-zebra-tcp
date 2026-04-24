Socket socket = new Socket(ip, port);
OutputStream outputStream = socket.getOutputStream();
outputStream.write(zpl.getBytes("UTF-8"));
outputStream.flush();
socket.close();