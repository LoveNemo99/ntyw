package com.tinz.ntyw.service;

import java.util.List;

import com.tinz.ntyw.entity.Tree;

public interface CantonService {

	List<Tree> getTree(Integer userCantonId);
}
