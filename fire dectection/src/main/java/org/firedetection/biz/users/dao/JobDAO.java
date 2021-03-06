package org.firedetection.biz.users.dao;

import java.util.List;

import org.firedetection.biz.users.vo.JobVO;

public interface JobDAO {
	public List<JobVO> getUserJob(String id);

	public int insertJob(JobVO vo);

	public int modifyJob(JobVO vo);

	public int deleteJob(int job_num);
	
	public JobVO getJob(int job_num);
}
