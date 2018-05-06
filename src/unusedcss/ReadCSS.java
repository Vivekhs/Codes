/**
 * 
 */
package unusedcss;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author Vivek Sinha
 *
 */
public class ReadCSS {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath ="D://Onboarding_AUS//Workspace//Gitlab//vivek-develop//mPowerHorizon//public//assets//css//styleHorizontal.css";
		Integer i =0;
		Set<String> classes = new HashSet<String>();
		Set<String> ids = new HashSet<String>();
		
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

//			stream.forEach((line)->{
//				System.out.println(line);
//			});
			
//			stream.filter(s-> s.contains("{")).forEach((line)->{
//				System.out.println(line);
//			});
			stream.filter(s-> s.contains("{") && !s.contains("@media"))
					.map((text)->{
						text = text.trim();
						text = text.substring(0, text.length()-1);
						text.trim();
						char[] temp = text.toCharArray();
						StringBuilder str = null;
						boolean isClass = false;
						for(char ch : temp){
							if((int)ch == 46 || (int)ch == 35){
								isClass = (int)ch == 46?true:false;
								
								str = new StringBuilder();
								continue;
							}
							
							if(str != null){
								if((int)ch == 45 || (int)ch > 64 && (int)ch < 91 || (int)ch > 96 && (int)ch < 123){
									str.append(ch);
								}
								else{
									if(isClass){
										classes.add(str.toString());
									}
									else{
										ids.add(str.toString());
									}
									str = null;
								}
							}
						}
						//classes.add(text);
						return text;
					}).collect(Collectors.counting());
			System.out.println("\t\t\t*** HTML ELEMENT CLASSES ***\n\n\n");
			classes.forEach(s->System.out.println(s));
			System.out.println("\n\n\n\t\t\t*** HTML ELEMENT IDS ***\n\n\n");
			ids.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private List<String> getFileNames(List<String> fileNames, Path dir) {
	    try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
	        for (Path path : stream) {
	            if(path.toFile().isDirectory()) {
	                getFileNames(fileNames, path);
	            } else {
	                fileNames.add(path.toAbsolutePath().toString());
	                System.out.println(path.getFileName());
	            }
	        }
	    } catch(IOException e) {
	        e.printStackTrace();
	    }
	    return fileNames;
	} 

}
