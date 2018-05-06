/**
 * 
 */
package com.problems;

/**
 * @author vivekhs
 *
 */
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 
class TestClass {
    
    static class Reader {
		
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean minus = (c == '-');
            if (minus) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c=read()) >='0' && c <= '9');
            if (minus) return -ret;
            return ret;
        }
        
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException {
            if (din==null) return;
            din.close();
        }
	}
	
    public static void main(String args[] ) throws Exception {
        
		
		Reader reader = new Reader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = reader.nextInt();
        int Q = reader.nextInt();
        
        int[] arr = new int[N];
        long[] sumArr = new long[N+1];
        sumArr[0] = 0;
        for (int i=0;i<N;i++) {
        	arr[i] = reader.nextInt();
        	sumArr[i+1] = sumArr[i]+ arr[i];
        }
        
        while (Q-- > 0) {      	
        	int L = reader.nextInt();
        	int R = reader.nextInt();
        	long result = (long) (Math.floor(sumArr[R] - sumArr[L-1])/(R-L+1));
        	bw.write(Long.toString(result));
        	bw.write("\n");
        }
        bw.close();
        reader.close();
	
    }
}
