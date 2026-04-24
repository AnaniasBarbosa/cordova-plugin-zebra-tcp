public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
    if (action.equals("print")) {
        String ip = args.getString(0);
        int port = args.getInt(1);
        String zpl = args.getString(2);

        try {
            Socket socket = new Socket(ip, port);
            OutputStream os = socket.getOutputStream();
            os.write(zpl.getBytes("UTF-8"));
            os.flush();
            socket.close();

            callbackContext.success("Printed");
        } catch (Exception e) {
            callbackContext.error(e.getMessage());
        }

        return true;
    }
    return false;
}