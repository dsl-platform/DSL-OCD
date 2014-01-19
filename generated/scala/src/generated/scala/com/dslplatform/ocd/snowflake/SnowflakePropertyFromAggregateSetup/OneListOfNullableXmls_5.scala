package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableXmls_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableXmls_5 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableXmls_5("+ URI +")"

   def copy(oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]] = this._oneListOfNullableXmls): OneListOfNullableXmls_5 = {

  require(oneListOfNullableXmls ne null, "Null value was provided for property \"oneListOfNullableXmls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableXmls)
    new OneListOfNullableXmls_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableXmls = oneListOfNullableXmls)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableXmls_5): this.type = {
    this._URI = result._URI
    this._oneListOfNullableXmls = result._oneListOfNullableXmls
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableXmls_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableXmls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableXmls = {
    _oneListOfNullableXmls
  }

  def oneListOfNullableXmls_= (value: IndexedSeq[Option[scala.xml.Elem]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableXmls") oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableXmls = if (oneListOfNullableXmls == null) IndexedSeq.empty else oneListOfNullableXmls)

}

object OneListOfNullableXmls_5 extends AggregateRootCompanion[OneListOfNullableXmls_5]{

  def apply(
    oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableXmls)
    require(oneListOfNullableXmls ne null, "Null value was provided for property \"oneListOfNullableXmls\"")
    new OneListOfNullableXmls_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableXmls = oneListOfNullableXmls)
  }

}
