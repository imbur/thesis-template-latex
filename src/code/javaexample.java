try {
    FileInputStream fis = new FileInputStream(file);
} catch (Exception e) {
    if(e instanceof FileNotFoundException){
        logger.severe("File not found");
    } else {
        logger.severe("An exception was thrown");
    }
}