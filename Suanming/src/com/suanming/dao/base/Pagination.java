package com.suanming.dao.base;


import java.util.List;

/**
 * 
* @ClassName: Pagination
* @Description: Page Object
* @author Kevin Lv
* @date 2013-5-27 下午10:30:01
 */
public class Pagination {

	private int pageSize = 100; //每页显示记录数
	private int currentPage = 1;//当前页
	private int maxElements = 0;//总记录数
	private int totalPage = 0;//总页数
	private int liststep = 2;
	private int listbegin = 0;
	private int listend = 0;
	private int offset = 0;
	private List<?> list;
	
	/**
	 * 
	* @Title: getTotalPage
	* @Description: 获取总页数
	* @param @return   
	* @return int    返回类型
	* @throws
	 */
	public int getTotalPage() {
		if (this.maxElements % this.pageSize == 0) {
			this.totalPage = this.maxElements / this.pageSize;
		} else {
			this.totalPage = this.maxElements / this.pageSize + 1;
		}
		return totalPage;
	}
	
	/**
	 * 
	* @Title: setCurrentPage
	* @Description: 设置当前页
	* @param @param currentPage   
	* @return void    返回类型
	* @throws
	 */
	public void setCurrentPage(int currentPage) {
		int total = (int) Math.ceil((double)maxElements / pageSize);
		if (currentPage > total) {
			this.currentPage = total;
		} else if (currentPage <= 1) {
			currentPage = 1;
		}else{
			this.currentPage = currentPage;
		}
	}
	
	public int getListbegin() {
		listbegin = (currentPage - (int) Math.ceil((double) liststep / 2));
		if (listbegin < 1) {
			listbegin = 1;
		}
		return listbegin;
	}
	
	public int getListend() {
		listend = currentPage + liststep / 2;
		if (listend > totalPage) {
			listend = totalPage;
		}
		return listend;
	}

	public Pagination() {
		
	}

	public Pagination(int maxElements) {
		this.maxElements = maxElements;
	}

	public Pagination(int pageSize, int currentPage, int maxElements) {
		this.pageSize = pageSize;
		this.maxElements = maxElements;
		this.currentPage = currentPage;
	}

	public int getListstep() {
		return liststep;
	}

	public void setListstep(int liststep) {
		this.liststep = liststep;
	}

	public void setListbegin(int listbegin) {
		this.listbegin = listbegin;
	}

	public void setListend(int listend) {
		this.listend = listend;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setMaxElments(int maxElements) {
		this.maxElements = maxElements;
	}

	public int getMaxElements() {
		return maxElements;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		if (offset <= 0) {
			this.offset = 0;
		} else if (offset > maxElements) {
			this.offset = maxElements-1;
		} else {
			this.offset = offset;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setMaxElements(int maxElements) {
		this.maxElements = maxElements;
	}

	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}
}
