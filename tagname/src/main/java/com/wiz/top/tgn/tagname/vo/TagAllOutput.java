package com.wiz.top.tgn.tagname.vo;
/**
 *	进行所有测点解析
 * @author linfengda
 * @create 2019-9-16
 * @since 1.0.0
 */
public class TagAllOutput {

        /**
         * tagid : 399
         * tagCode : ABC
         */

    	public long tagid;
    	public String tagCode;
    	public String siteCode;
        public String getSiteCode() {
			return siteCode;
		}

		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}

		public long getTagid() {
            return tagid;
        }

        public void setTagid(long tagid) {
            this.tagid=tagid;
        }

        public String getTagCode() {
            return tagCode;
        }

        public void setTagCode(String tagCode) {
            this.tagCode=tagCode;
        }
    }