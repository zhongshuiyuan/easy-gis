package org.egc.gis.gdal;

/**
 * Description:
 * <pre>
 *
 * </pre>
 *
 * @author houzhiwei
 * @date 2018/11/2 11:53
 */
public interface Projection {
    String reProject(String file, String dstCrs);
}
