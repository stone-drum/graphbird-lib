package de.graphbird.lib.model.information;

import java.time.ZonedDateTime;
import java.util.List;

import de.graphbird.lib.model.file.FileInformation;
import de.graphbird.lib.model.geo.Coordinate;
import de.graphbird.lib.model.information.shared.Comment;
import de.graphbird.lib.model.user.User;

public interface IInformation{
	public Long getId();
	public FileInformation getFile();
	public User getCreator();
	public String getName();
	public String getDescription();
	public InformationType getType();
	public ZonedDateTime getCreationDate();
	public boolean isExpires();
	public ZonedDateTime getExpirationDate();
	public String getThumbnail();
	public List<Coordinate> getCoordinates();
	public List<String> getTags();
	public List<Long> getAccessGroups();
	public List<Long> getAccessUsers();
	public List<Comment> getComments();
	public List<Long> getSubInformationIds();
	public int getCurrentAnalyzationProgress();
	public int getTotalAnalytizationSteps();
}
