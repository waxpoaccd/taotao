package com.md.tools;

import java.util.List;

/**
 * @author mengdong
 * @create 2018-11-11 23:09
 */
public class EUDataGridResult {

    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
