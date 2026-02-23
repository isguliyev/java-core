public class Video {
	private String file;
	private VideoFormat videoFormat;

	public Video(String file, VideoFormat videoFormat) {
		setFile(file);
		setVideoFormat(videoFormat);
	}

	public String getFile() {
		return this.file;
	}

	public VideoFormat getVideoFormat() {
		return this.videoFormat;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setVideoFormat(VideoFormat videoFormat) {
		this.videoFormat = videoFormat;
	}
}