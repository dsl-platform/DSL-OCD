package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneXmls_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneXmls_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneXmls_2("+ URI +")"

   def copy(oneListOfOneXmls: IndexedSeq[scala.xml.Elem] = this._oneListOfOneXmls): OneListOfOneXmls_2 = {

  require(oneListOfOneXmls ne null, "Null value was provided for property \"oneListOfOneXmls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneXmls)
    new OneListOfOneXmls_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneXmls = oneListOfOneXmls)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneXmls_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneXmls = result._oneListOfOneXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneXmls_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneXmls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneXmls = {
    _oneListOfOneXmls
  }

  def oneListOfOneXmls_= (value: IndexedSeq[scala.xml.Elem]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneXmls") oneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneXmls = if (oneListOfOneXmls == null) IndexedSeq.empty else oneListOfOneXmls)

}

object OneListOfOneXmls_2 extends AggregateRootCompanion[OneListOfOneXmls_2]{

  def apply(
    oneListOfOneXmls: IndexedSeq[scala.xml.Elem] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneXmls)
    require(oneListOfOneXmls ne null, "Null value was provided for property \"oneListOfOneXmls\"")
    new OneListOfOneXmls_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneXmls = oneListOfOneXmls)
  }

}
